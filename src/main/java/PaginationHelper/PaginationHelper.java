package src.main.java.PaginationHelper;

import java.util.*;

/**
 * Created by JJOHN on 7/2/2017.
 */
public class PaginationHelper<I> {

    private List<I> collection;
    private int itemsPerPage;
    private Map<Integer, List<Integer>> pages = new HashMap<>();

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
        buildLists();

    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();

    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return pages.size();
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {

        if (pageIndex >= pages.size() || pageIndex < 0 || collection == null) return -1;

        int i = 0;
        for (Map.Entry<Integer, List<Integer>> entry : pages.entrySet()) {
            if (i == pageIndex) return entry.getValue().size();
            i++;
        }

        return 0;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        // itemIndex is out of value range
        if ( collection == null || collection.isEmpty() || (!collection.contains(itemIndex))) return -1;
        int index = 0;

        for (Map.Entry<Integer, List<Integer>> entry : pages.entrySet()) {
            for (Integer i : entry.getValue()) {
                if (itemIndex == i) {
                    return index;
                }
            }
            index++;
        }
        return 0;
    }

    private void buildLists(){

        if (collection == null || itemsPerPage < 0) return; // throw an error

        Integer pageNumber = 1;
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < this.collection.size(); i++) {
            if (list.size() < this.itemsPerPage) {
                list.add((Integer) this.collection.get(i));
            }

            // list is full
            else {
                // System.out.format("Page %d:", pageNumber);
                // System.out.println(Arrays.toString(list.toArray()));

                // page item length has reached its maximum limit -- start with new list
                pages.put(pageNumber, list);
                pageNumber++;
                // list.clear();
                list = new ArrayList<Integer>();
                list.add((Integer) this.collection.get(i)); // still need to add current value after starting a new list
                //printPages();
            }
        }
        // print and save out remainder values
        pages.put(pageNumber, list);
       //System.out.format("Page %d:", pageNumber);
       //System.out.println(Arrays.toString(list.toArray()));
    }

    private void printPages() {
        for (Map.Entry<Integer, List<Integer>> entry : pages.entrySet()) {
            System.out.println("Page Number: " + entry.getKey());
            for (Integer i : entry.getValue()) {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        /*PaginationHelper paginationHelper = new PaginationHelper(Arrays.asList(1, 3, 5, 6, 4, 2, 6), 2);
        // paginationHelper.buildLists();
        paginationHelper.printPages();
        System.out.println("Item count: " + paginationHelper.itemCount());
        System.out.println("Items per page: " + paginationHelper.itemsPerPage);
        System.out.format("Page %d index: %d\n", 2, paginationHelper.pageIndex(2));
        System.out.format("Page %d item count: %d\n", 1, paginationHelper.pageItemCount(1));
        System.out.println("Page count: " + paginationHelper.pageCount());

        System.out.println(paginationHelper.pageIndex(100));


        PaginationHelper paginationHelper1 = new PaginationHelper(null, 2);
        System.out.println(paginationHelper1.pageIndex(0));*/

        List<Integer> collection = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24);
        PaginationHelper<Integer> helper = new PaginationHelper<>(collection, 10);

        helper.printPages();

        System.out.println("Tests");
        System.out.println(helper.pageCount());
        System.out.println(helper.itemCount());
        System.out.println("");
        System.out.println(helper.pageIndex(23));
        System.out.println(helper.pageIndex(24));
        System.out.println(helper.pageIndex(40));
        System.out.println(helper.pageIndex(3));
        System.out.println(helper.pageIndex(-1));
        System.out.println(helper.pageIndex(-23));
        System.out.println(helper.pageIndex(-15));
        System.out.println("");
        System.out.println(helper.itemCount());
        System.out.println("");
        System.out.println(helper.pageItemCount(0));


        // PaginationHelper paginationHelper2 = new PaginationHelper(Arrays.asList(2, 3, 5, 2, 2, 6, 3, 3), 3);
        // paginationHelper2.buildLists();

        // PaginationHelper paginationHelper3 = new PaginationHelper(Arrays.asList(1), 1);

        // paginationHelper3.buildLists();
    }
}
