package Single;

class Binary {
    
    Binary(String string){
        for( byte b : string.getBytes() ){
            System.out.print(Integer.toBinaryString(b) + " ");
        }
        System.out.println();
    }
    
    Binary(Integer integer){
        System.out.println(Integer.toBinaryString(integer));
    }
    
    public static void main(String[] args) {
        new Binary("HackerRank");
        new Binary(8675309);
    }
}