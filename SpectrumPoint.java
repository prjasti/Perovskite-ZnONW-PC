public class SpectrumPoint
{
  // X: photon energy (eV)
  // Y: normalized irradiance
  // Z: photon flux
  Double X;
  Double Y;
  Integer Z;
  public SpectrumPoint(Double X, Double Y, Integer Z)
  {
    this.X = X;
    this.Y = Y;
    this.Z = Z;
  }
  public Double getX() 
  {return X;} 
  
  public Double getY()
  {return Y;} 
  
  public Integer getZ()
  {return Z;}
  
  public void setX(Double X)
  {this.X = X;}
  
  public void setY(Double Y)
  {this.Y = Y;}
  
  public void setZ(Integer Z)
  {this.Z = Z;}
}
