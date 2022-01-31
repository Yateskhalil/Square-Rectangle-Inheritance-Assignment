package org.WalkerCC_CompSci;

public final class Square extends Rectangle{

    public Square(double sideLength) {
        super(1,6);  //What goes here?

    }

    public double getSideLength(){
        return this.length;
    }

    public double setSideLength(double width){
      return this.length*2;
    }


}
