package src.main.java.PaginationHelper;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.*;


/**
 * Created by JJOHN on 7/2/2017.
 */
class PaginationHelperTest {


            @Test
            public void test() {
                List<Integer> collection = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24);
                PaginationHelper<Integer> helper = new PaginationHelper<>(collection, 10);

                //PaginationHelperTest.assertEquals(helper.itemCount(), 3,"page_count is returning incorrect value.");
                //Test.assert_equals(helper.page_item_count(1), 10, 'page_item_count is returning incorrect value.');
               /* @Test
                        Test.assert_equals(helper.page_item_count(2), 4, 'page_item_count is returning incorrect value');
                @Test
                        Test.assert_equals(helper.page_item_count(3), -1, 'page_item_count is returning incorrect value');
                @Test
                        Test.assert_equals(helper.page_index(23), 2, 'page_index returned incorrect value');
                @Test
                        Test.assert_equals(helper.page_index(24), -1, 'page_index returned incorrect value when provided a item_index argument that was out of range');
                @Test
                        Test.assert_equals(helper.page_index(40), -1, 'page_index returned incorrect value when provided a item_index argument that was out of range');
                @Test
                        Test.assert_equals(helper.page_index(3), 0, 'page_index returned incorrect value');
                @Test
                        Test.assert_equals(helper.page_index(-1), -1, 'page_index returned incorrect value when provided a itemIndex argument that was out of range. pageIndex(-1) should return -1');'
                @Test
                        Test.assert_equals(helper.page_index(-23), -1, 'page_index returned incorrect value when provided a item_index argument that was out of range. pageIndex(-23) shoudl return -1');
                @Test
                        Test.assert_equals(helper.page_index(-15), -1, 'page_index returned incorrect value when provided a item_index argument that was out of range.')
                @Test
                        Test.assert_equals(helper.item_count, 24, 'item_count returned incorrect value')
                        */
            }





}