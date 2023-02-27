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

  public void setSide(int side) {
    setHeight(side);
    setWidth(side);
  }

  public int getSide() {
    return getWidth();
  }
}

class LiskovSubstitution {

  private static Rectangle getNewRectangle() {
    //the rectangleObject (base) is substituted by object of square(derived) class 
    return new Square();
  }

  public static void main(String args[]) {
  
    Rectangle rectangleObject = LiskovSubstitution.getNewRectangle();
    rectangleObject.setWidth(5);
    rectangleObject.setHeight(10);
    
    // user knows that r it's a rectangle.
    // It assumes that he's able to set the width and height as for the base class
    System.out.println(rectangleObject.getArea());
    
  }
}
