package lox;

class Return extends RuntimeException {
    final Object value;

    Return(Object value) {
        // Disables some JVM machinery in RuntimeException we don't need
        // since we are using exception for control flow and don't need
        // stack traces
        super(null, null, false, false);
        this.value = value;
    }

}
