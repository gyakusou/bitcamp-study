package bitcamp.app1;

import java.util.Date;

public class Car { // 벨류 오브젝트(값객체)
  protected String model; // 필드
  protected String maker;
  protected boolean auto;
  protected int capacity;
  protected Date createdDate;
  protected Engine engine; // 벨류 오브젝트 안에 있는 벨류 오브젝트

  @Override
  public String toString() {
    return "Car [model=" + model + ", maker=" + maker + ", auto=" + auto + ", capacity=" + capacity
        + ", createdDate=" + createdDate + ", engine=" + engine + "]";
  }

  public String getModel() { // get을 제외하고 첫번째 대문자인 M을 소문자 m으로 바꾼 이름 = 프라퍼티
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getMaker() {
    return maker;
  }

  public void setMaker(String maker) {
    this.maker = maker;
  }

  public boolean isAuto() {
    return auto;
  }

  public void setAuto(boolean auto) {
    this.auto = auto;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }


}
