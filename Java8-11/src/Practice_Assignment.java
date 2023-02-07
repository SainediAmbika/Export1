import java.util.Arrays;

public class Practice_Assignment {
/*Compare two array elements*/
	public static void main(String[] args) {
		int a[]= {2,4,6,8,9};
		int b[]= {2,4,6,8,9};
		System.out.println("Elements of two arrays are same:"+(Arrays.equals(a, b)));
	}
}

//2nd Method
/* public static void main(String[] args) {
		int a[]= {2,4,6};
		int b[]= {2,4,6};
		Object[] a1={a};
		Object[] b1={b};
		System.out.println(Arrays.deepEquals(a1, b1));
}
}*/