package com.mibu.singleton;

public class Main {

  public static void main(String[] args) {
    HistoryList historyList = HistoryList.getInstance();
    historyList.addCommand("command1");
    historyList.addCommand("command2");
    historyList.addCommand("command4");
    historyList.undoCommand();
    historyList.addCommand("command3");
    historyList.addCommand("command4");
    System.out.printf(historyList.toString());
  }
}
