package me.hajk1;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class StringInternSample {
  // Concurrent canonicalizing map atop ConcurrentMap - not optimal
  private static final ConcurrentMap<String, String> map = new ConcurrentHashMap<>();

  public static String intern1(String s) {
    String previousValue = map.putIfAbsent(s, s);
    return previousValue == null ? s : previousValue;
  } // Concurrent canonicalizing map atop ConcurrentMap - faster!

  public static String intern2(String s) {
    String result = map.get(s);
    if (result == null) {
      result = map.putIfAbsent(s, s);
      if (result == null) result = s;
    }
    return result;
  }
}
