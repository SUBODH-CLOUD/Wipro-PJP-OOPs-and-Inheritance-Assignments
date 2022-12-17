class Box{
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume(){
        return width*height*depth;
    }

    public static void main(String[] args) {
        Box ob = new Box(7, 9, 8);
        // ob.volume();
        System.out.println(ob.volume());
    }
}

