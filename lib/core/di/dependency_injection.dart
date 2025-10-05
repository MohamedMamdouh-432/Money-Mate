import 'package:get_it/get_it.dart';
import 'package:money_mate/core/networking/api_service.dart';
import 'package:money_mate/core/networking/dio_factory.dart';

final getIt = GetIt.instance;

Future<void> setupDI() async {
  // dio
  final dio = DioFactory.getDio();
  getIt.registerLazySingleton<ApiService>(() => ApiService(dio));
}
