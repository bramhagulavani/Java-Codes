class FirstProgram {
    public static void main(String[] args) {
    //     System.out.println("Hello, World!");
    //     int num=10;
    // if(num>5){
    //     System.out.println("num is greater than 5");
    // }
    // else
    // {
    //     System.out.println("num is less than or equal to 5");
    // }

    // for(int i=1; i<=10; i++){
    //     for(int j=1; j<=10; j++)
    //         {
    //         System.out.print(i*j + "\t");
    //     }
    //     System.out.println();
    // }

    for(int i=1; i<=10;i++)
    {
        if(i==5)
        {
            System.out.println("Skipping 5");
            continue;
        }
        System.out.println(i);
    }
    
}
}