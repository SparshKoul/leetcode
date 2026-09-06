class Solution {

    public static void fill(int[][] image , int sr, int sc , int original,int newcolor){

        if(sr <0 || sr >image.length-1 || sc  <0 || sc >image[0].length-1){
            return;
        }
        if(image[sr][sc] != original){
            return ;
        }

        image[sr][sc] =newcolor;

        fill(image,sr-1,sc ,original,newcolor);
        fill(image,sr+1,sc ,original,newcolor);
        fill(image,sr,sc-1 ,original,newcolor);
        fill(image,sr,sc+1 ,original,newcolor);


    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) {

        int original =image[sr][sc];

        if(original !=newcolor){
            fill(image,sr,sc,original,newcolor);
        }

        return image;
        
    }
}