class IncreaseDecrease {

    public static void main(String[] args){
        // Normal increase
        //use the value and then evaluate the expression
        int increase = 0;
        increase++;
        increase++;
        System.out.println("increase: "+ increase++);
        System.out.println(increase);

        //Normal decrease

        int decrease = 10;

        // Normal decrease
        //use the value and then evaluate the expression
        decrease--;
        decrease--;
        System.out.println(decrease--);
        System.out.println(decrease);

        // shor sintax decrease

        decrease = decrease-=5; // the same decrease = decrease - 5;
        System.out.println(decrease);
    }}