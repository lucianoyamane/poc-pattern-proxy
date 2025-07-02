package realscenario.service;

public interface IBookService<INPUT, OUTPUT> {
    OUTPUT save(INPUT input);
} 