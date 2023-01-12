public class ListNode{
  private String data;
  private ListNode next,prev;

  public ListNode(String d){ //default next/prev should be null
  }
  
  public String toString(){} //Return the string of the data (matters more for other types of nodes)
  
  public String getData(){} //return the data
  
  public ListNode next(){} //return the next node
  
  public ListNode prev(){} //return the previous node
  
  public String setData(String newdata){}//replace the data, with the newdata, return the original data.
  
  public void setNext(ListNode n){}
  
  public void setPrev(ListNode n){} 

}
