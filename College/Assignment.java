class Assignment {
    public static void main(String[] args) {
        Adder adder = new Adder();
        int[] inputArr = {2, 7, 11, 15};
        int target = 9;
        adder.getdata(inputArr, target);
        int[] result = adder.numsum();

        if (result.length == 2) {
            System.out.println("Pair found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found.");
        }
    }
}