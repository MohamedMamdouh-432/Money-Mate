import 'dart:developer';

import 'package:flutter/foundation.dart';

class Logger {
  Logger._();

  //* Success
  static void success(String message) {
    if (kDebugMode) {
      log('\x1B[32m✅ $message\x1B[0m', level: 0, name: '');
    }
  }

  //* Debug
  static void debug(String message) {
    if (kDebugMode) {
      log('\x1B[37m🕷️ $message\x1B[0m', level: 1, name: '');
    }
  }

  // Info
  static void info(String message) {
    if (kDebugMode) {
      log('\x1B[33m📣 $message\x1B[0m', level: 2, name: '');
    }
  }

  //! Error
  static void error(String message) {
    if (kDebugMode) {
      log('\x1B[31m❌ $message\x1B[0m', level: 3, name: '');
    }
  }
}
