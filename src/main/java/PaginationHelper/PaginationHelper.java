package src.main.java.PaginationHelper;

import java.util.*;

/**
 * Created by JJOHN on 7/2/2017.
 */
public class PaginationHelper<I> {

    private List<I> collection;
    private int itemsPerPage;
    private int pageCount ;

    private Map<Integer, List<I>> pages = new HashMap<>();

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
        buildPages();
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
        int pageCounter = 1;
        int pages = 0;

        // all items can fit on one page
        if (collection.size() <= itemsPerPage) return 1;


        for (int i = 0; i < collection.size(); i++) {
            if (pageCounter == this.itemsPerPage) {
                pages += 1;
                pageCounter = 0;
            }
            pageCounter++;
        }
        pages++;    // for remainder items
        this.pageCount = pages;
        return pages;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {


        if (pageIndex > this.pageCount()) return -1;




        return 0;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (!collection.contains(itemIndex)) return -1;

        return 0;
    }

    private void buildPages() {
        int pageCounter = 1;
        int pages = 0;
        List<I> currentPageItems = new ArrayList<>();

        /* TODO: Needs work
        for (I : this.collection) {
            for (int i = 0; i < pageCount ; i++) {
                for (int j = 1; j <= itemsPerPage ; j++) {
                    currentPageItems.add(this.collection.get())
                }
                this.pages.put(i, currentPageItems);
            }
        }


        for (int i = 0; i < this.collection.size(); i++) {
            for (int j = 0; j < pageCount; j++) {
                for (int k = 0; k < itemsPerPage; k++) {
                    currentPageItems.add(this.collection.get(i));
                }
                this.pages.put(i, currentPageItems);
            }
        }
        */
    }

    public static void main(String[] args) {
        PaginationHelper paginationHelper = new PaginationHelper(Arrays.asList(1, 3, 5, 6, 4, 2, 6), 2);
        System.out.println(paginationHelper.pageCount());
    }
}
