package main.java;
/*File: Item.java
 * Author: amehlhas, adalvi1
 * Date: 2/19/19
 * Description: Item class that is used as the "elements" of a set
 * */

public final class Item {
        public int key;
        //constructor
        public Item(int keyValue) { 
                key = keyValue;
        }
        // further components and methods
        public int getKey() {
        	return key;
        }
        public void setKey(int key) {
        	this.key = key;
        }
}