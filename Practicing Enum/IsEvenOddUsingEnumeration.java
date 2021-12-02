package LearnEnum;

class IsEvenOddUsingEnumeration{
    
    enum EvenOdd{

        EVEN(){
            @Override
            public boolean isEvenOrOdd (int number){
                return (number % 2  == 0);
            }

        },  
        ODD() {
            @Override
            public boolean isEvenOrOdd (int number){
                return !(number % 2  == 0);
            }
        };
    
        abstract boolean isEvenOrOdd (int number);
    }

    public static void main(String[] args) {
        /*int value = 2;

        for (EvenOdd isPar : EvenOdd.values() ){
            System.out.println(isPar.isEvenOrOdd(value));
        }*/
        System.out.println("__Testing if numbers are odd___");
        for (int i = 1; i<=10;i++){
            System.out.println(i+" is ODD = "+EvenOdd.ODD.isEvenOrOdd(i));
        }
        System.out.println("\n__Testing if numbers are even___");
        for (int i = 1; i<=10;i++){
            System.out.println(i+" is EVEN = "+EvenOdd.EVEN.isEvenOrOdd(i));
        }
    }
}