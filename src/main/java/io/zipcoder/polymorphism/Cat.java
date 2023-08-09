package io.zipcoder.polymorphism;


    public class Cat extends Pet{

        public Cat(String name){
            super();
        }

        @Override
        public String speak(){
            return "Meow!";
        }
    }
}
