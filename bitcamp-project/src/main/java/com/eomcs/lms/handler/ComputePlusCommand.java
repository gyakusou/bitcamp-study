// "/board/add" 명령어 처리

package com.eomcs.lms.handler;

import com.eomcs.util.Prompt;

public class ComputePlusCommand implements Command { //


  Prompt prompt;

  public ComputePlusCommand(Prompt prompt) {
    this.prompt = prompt;
  }

  @Override
  public void execute() { //

    int math1 = prompt.inputInt("수1?");
    int math2 = prompt.inputInt("수2?");

    int math3 = math1 + math2;

    System.out.printf("계산결과는 %d 입니다.\n", math3);

  }
}


