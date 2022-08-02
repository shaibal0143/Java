class palindrome{
	public static void main(String[] args){
	int n=Integer.parseInt(args[0]);
	int rem,sum=0,temp;
	temp=n;
	while(n>0){
	rem=n%10;
	sum=(sum*10)+rem;
	n=n/10;
}
if(temp==sum){
System.out.println("Palindrome Number...");
}else{
	System.out.println("Not a Palindrome Number...");
	}
     }
}
