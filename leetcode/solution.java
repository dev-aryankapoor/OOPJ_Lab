import java.util.Stack;

public class solution {
    public static void main(String[] args) {
        solution sol = new solution();

        int[] nums = { 5, 4, 3, 2, 1 }; // Input array
        int[] result = sol.nextGreaterElements(nums); // Call the method

        // Print the result array
        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();

        st.push(-1);
        st.push(nums[0]);
        int n = nums.length;
        int[] arr = new int[n];

        for (int i = 1; i < n; i++) {
            int top = st.peek();
            if (top < nums[i]) {
                st.pop();
                st.push(nums[i]);
                arr[i - 1] = top;
            } else {
                st.push(nums[i]);
            }
        }

        // int j = 1;

        // while (!st.isEmpty()) {
        // st.pop();
        // if (st.isEmpty()) {
        // return arr;
        // }
        // arr[n - j] = st.peek();
        // j++;
        // }

        int temp = 0, count = -1, j = n - 1;

        while (st.peek() != -1) {
            temp = st.pop();
            count++;
        }

        while (count != 0) {
            arr[j--] = temp;
            count--;
        }

        arr[count] = -1;

        return arr;
    }
}
