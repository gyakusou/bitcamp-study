package com.eomcs.util;

import java.util.Arrays;

public class ArrayList2<E> {
  
  private static final int DEFAULT_CAPACITY = 2;
  
  Object[] elementDate;
  int size;
  
  public ArrayList2 () {
    this.elementDate = new Object[DEFAULT_CAPACITY];
  }
  
  public ArrayList2(int initialCapacity) {
    if (initialCapacity < DEFAULT_CAPACITY) {
      this.elementDate = new Object[DEFAULT_CAPACITY];
    } else {
      this.elementDate = new Object[initialCapacity];
    }
  }
  
 public void add(E e) {
   if (this.size == this.elementDate.length) {
     int oldSize = this.elementDate.length;
     int newSize = oldSize + (oldSize >> 1);
     
     this.elementDate = Arrays.copyOf(this.elementDate, newSize);
     /*
     Object[] newArr = new Object[newSize];
     for (int i = 0; i < this.size; i++) {
       newArr[i] = this.elementDate[i];
     }
     this.elementDate = newArr;
     */
   }
   this.elementDate[this.size++] = e;
 }
 
 @SuppressWarnings("unchecked")
public E get(int index) {
   if (index < 0 || index >= this.size) {
     return null;
   }
   return (E) this.elementDate[index];
 }
 
 public E set(int index, E e) {
   if (index < 0 || index >= this.size ) {
     return null;
   }
   @SuppressWarnings("unchecked")
  E oldValue = (E) this.elementDate[index];
   this.elementDate[index] = e;
   return oldValue;
 }
 
 public E remove(int index) {
   if (index < 0 || index >= this.size ) {
     return null;
   }
   
   @SuppressWarnings("unchecked")
  E oldValue = (E) this.elementDate[index];
   System.arraycopy(this.elementDate, index + 1, this.elementDate, index, this.size - (index+1));
   /*
   for (int i = index + 1; i < this.size; i++) {
     this.elementDate[i - 1] = this.elementDate[i];
   }
   */
   this.size--;
   return oldValue;
 }
 
 public int size() {
   return this.size;
 }
 
 public Object[] toArray() {
   
   return Arrays.copyOf(this.elementDate, this.size);
   /*
   Object[] arr = new Object[this.size];
   for (int i = 0; i < this.size; i++) {
     arr[i] = this.elementDate[i];
   }
   return  arr;
   */
 }
 
 @SuppressWarnings("unchecked")
public E[] toAtrray(E[] arr) {
   if (arr.length < this.size) {
     return (E[]) Arrays.copyOf(this.elementDate, this.size, arr.getClass());
   }
   System.arraycopy(this.elementDate, 0, arr, 0, this.size);
   return arr;
 }
   
 public void add(int index, E value) {
   if (index < 0 || index >= this.size)
     return;
   
   if (this.size == this.elementDate.length) {
     int oldSize = this.elementDate.length;
     int newSize = oldSize + (oldSize >> 1);
     
     this.elementDate = Arrays.copyOf(this.elementDate, newSize);
   }
   
   for (int i = size - 1; i >= index; i--)
     this.elementDate[i + 1] = this.elementDate[i];
         
   this.elementDate[index] = value;
   this.size++;
 }
}

//26부터
















