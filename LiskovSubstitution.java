class Rectangle{
  int m_width;
  int m_height;
 
  public void setWidth(int width){
    m_width = width;
  }
 
  public void setHeight(int h) {
    m_height = h;
  }
 
  public int getWidth() {
    return m_width;
  }
 
  public int getHeight() {
    return m_height;
  }
 
  public int getArea() {
    return m_width * m_height;
  }
 
}

class Square extends Rectangle {

  public void setSide (int side) {
    setHeight(side);
    setWidth(side);
  }
 
  public int getSide () {
    return getWidth();
  }
}
