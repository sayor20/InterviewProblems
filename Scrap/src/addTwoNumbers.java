
public class addTwoNumbers {

	public static void main(String[] args) {
		int[] a1 = new int[]{8};
		int[] a2 = new int[]{};
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(0);
		l1.next = null;
		l2.next = null;
		ListNode hl1 = l1;
		ListNode hl2 = l2;
		
		for(int i=0;i<a1.length;i++){
			ListNode temp = new ListNode(a1[i]);
			temp.next = null;
			l1.next = temp;
			l1=l1.next;
		}
		for(int j=0;j<a2.length;j++){
			ListNode temp = new ListNode(a2[j]);
			temp.next = null;
			l2.next = temp;
			l2=l2.next;
		}
		System.out.println(addTwoNumb(hl1, hl2));
	}
	
    public static ListNode addTwoNumb(ListNode l1, ListNode l2) {
        ListNode l3,head;
        int tempSum=0,carry=0;
        l3 = new ListNode(0);
        l3.next = null;
        head = l3;
        if(l1!=null || l2!=null){
            tempSum = l1.val+l2.val;
            if(tempSum<10){
                l3.val = tempSum;
                carry = 0;
            }
            else{
                l3.val = tempSum%10;
                carry = 1;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null || l2!=null || carry!=0){
            ListNode temp = new ListNode(0);
            temp.next = null;
            if(l1!=null && l2!=null){
                tempSum = carry+l1.val+l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            else if(l1!=null){
                tempSum = carry+l1.val;
                l1 = l1.next;
            }
            else if(l2!=null){
                tempSum = carry+l2.val;
                l2 = l2.next;
            }
            else
                tempSum = carry;
            if(tempSum<10){
                temp.val = tempSum;
                l3.next = temp;
                carry = 0;
                System.out.println("1: "+l3.val+" "+l3.next);
            }
            else{
                temp.val = tempSum%10;
                l3.next = temp;
                carry = 1;
                System.out.println("2: "+l3.val+" "+l3.next);
            }
 
                l3 = l3.next;
        }
        return head;
    }

}
