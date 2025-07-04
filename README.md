# 📝 My Blog — Spring Boot Edition (v2.0)

Это обновлённая версия блога из задания третьего спринта, переписанная с использованием **Spring Boot 3.5+**.

## ✅ Основные изменения

- Переписано под **Spring Boot 3.5**
- Используется сборка через **Gradle** (вместо Maven)
- Приложение упаковано как **Executable Jar**, запускается локально
- Используется встроенный сервлет-контейнер (**Tomcat**)
- Покрыто тестами: **JUnit 5**, `@SpringBootTest`, `@WebMvcTest`, `@DataJpaTest`
- Контекст кэшируется между тестами
- Сохранена история коммитов из исходного проекта
- Проставлен финальный тег `v2.0`

## 🔧 Функционал

- Добавление, редактирование и удаление постов
- Лайки и комментарии к постам
- Загрузка изображений
- Поддержка пагинации и поиска
- Шаблоны Thymeleaf для отображения страниц

## 🚀 Как собрать и запустить

### Сборка:
```bash
./gradlew build
