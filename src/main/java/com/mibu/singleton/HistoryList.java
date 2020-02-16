package com.mibu.singleton;

import java.util.ArrayList;
import java.util.List;

public class HistoryList {

  private List<String> history;
  private static HistoryList instance = new HistoryList();

  private HistoryList() {
    history = new ArrayList<>();
  }

  public static HistoryList getInstance() {
    return instance;
  }

  public void addCommand(String command) {
    history.add(command);
  }

  public void undoCommand() {
    history.remove(history.size() - 1);
  }

  public String toString() {
    StringBuilder result = new StringBuilder();
    for (String s : history) {
      result.append(" ");
      result.append(s);
      result.append("\n");
    }
    return result.toString();
  }
}
