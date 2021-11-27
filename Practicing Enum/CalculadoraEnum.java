class CalculadoraEnum {
    
    enum Calculator{

        SUM("+"){
            @Override
            public double operation (double x, double y)
            {
                return x + y;
            } 
        }, 
        MINUS("-"){
            @Override
            public double operation (double x, double y)
            {
                return x - y;
            } 
        }, 
        PLUS("*"){
            @Override
            public double operation (double x, double y)
            {
                return x * y;
            } 
        }, 
        DIVISION("/"){
            @Override
            public double operation (double x, double y)
            {
                return x / y;
            } 
        }; 

        private Calculator(String symbol) {
            this.symbol = symbol;
        }

        String symbol;

        public String toString () {
            return this.symbol;
        }

        public abstract double operation(double x, double y);  

    }


    public static void main(String[] args) {
        double[] value = {2.0, 3.0};

        for (Calculator calc : Calculator.values() ){
            System.out.println(value[0]+" "+calc.toString()+" "+value[1]+" = "+calc.operation(value[0],value[1]));
        }
            System.out.println("\n\n\n"+ Calculator.SUM.operation(value[0], value[1]));

    }

}