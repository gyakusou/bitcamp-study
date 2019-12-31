package com.eomcs.lms.handler;

import com.eomcs.lms.domain.Lesson;

public class LessonList {
  
  static final int DEFAULT_CAPACITY = 100;

  Lesson[] list;
  int size = 0;
  
  public LessonList() {
    this.list = new Lesson[DEFAULT_CAPACITY];
  }
  
  public LessonList(int capacity) {
    if (capacity < DEFAULT_CAPACITY || capacity > 10000)
      this.list = new Lesson[DEFAULT_CAPACITY];
    else
      this.list = new Lesson[capacity];
  }
  
  public Lesson[] toArray() {
    Lesson[] arr = new Lesson[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }
    return arr;
  }
  
  public void add(Lesson lesson) {
    this.list[this.size++] = lesson;
  }
  
}