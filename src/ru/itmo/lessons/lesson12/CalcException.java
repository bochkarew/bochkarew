package ru.itmo.lessons.lesson12;
// можно создавать собственные классы исключения
// если хотим создать исклюечение времени выполения,
// то класс должен наследоваться от RuntimeException

// если хотим создать исклюечение времени компиляции,
// то класс должен наследоваться от Exception
public class CalcException extends Throwable {
    public CalcException(String message){
        super(message);
    }
    public CalcException(String message, Throwable cause){
        super(message, cause);
    }
    @Override
    public String getMessage(){
        return super.getMessage() + " будьте внимательны ";
    }
}
