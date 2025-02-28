package me.hajk1;

public class OperationMain {
  public static void main(String[] args) {
    Operation op = Operation.PLUS;
    OperationLegacy op2 = OperationLegacy.PLUS;
    System.out.println(op.apply(1.2d, 1.3d));
    System.out.println(op2.apply(1.2d, 1.3d));
  }
}
