package net.loveruby.cflat.asm;

abstract public class Assembly {
    abstract public String toSource(SymbolTable table);

    public boolean isInstruction() {
        return false;
    }

    public boolean isLabel() {
        return false;
    }

    public boolean isDirective() {
        return false;
    }

    public boolean isComment() {
        return false;
    }

    public void collectStatistics(Statistics stats) {
        // does nothing by default.
    }

    public void fixStackOffset(long diff) {
        // does nothing by default.
    }
}
