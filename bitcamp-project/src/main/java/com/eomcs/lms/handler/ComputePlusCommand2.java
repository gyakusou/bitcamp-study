// "/compute/plus" 명령어 처리

package com.eomcs.lms.handler;

import com.eomcs.util.Prompt;

public class ComputePlusCommand2 implements Command { //

  Prompt prompt;

  public ComputePlusCommand2(Prompt prompt) {
    this.prompt = prompt;
  }

  @Override
  public void execute() {

    int a = prompt.inputInt("수1? ");
    int b = prompt.inputInt("수2? ");

    System.out.printf("계산결과는 %d 입니다.", a + b);
  }
}


