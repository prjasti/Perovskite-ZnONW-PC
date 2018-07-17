import java.util.Random;
class Substrate{
    int length;
    int width;
    int distanceApart;
    public Substrate(){
      this.length = 1000;
      this.width = 1000;
      this.distanceApart = 50;
    }
    public Substrate(int length, int width, int distanceApart){
      this.length = length;
      this.width = width;
      this.distanceApart = distanceApart;
    }
    public boolean[][] generateHexagonLattice(){
        boolean[][] latticePositions = new boolean[length][width];
        int i;
        int distanceDown = (int)(distanceApart * Math.sqrt(3)/2);
        for (int row = 0; row < length; row += distanceDown){
          if (row % 2 == 0){
            i = 0;
          }
          else {
            i = distanceApart / 2;
          } 
          for (int j = i; j < width; j += distanceApart){
            latticePositions[row][j] = true;
          }
        }
        return latticePositions;
    }
  public static void main(String[] args){

  }
}
