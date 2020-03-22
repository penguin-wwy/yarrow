package com.kelthuzadx.yarrow.hir.instr;

import com.kelthuzadx.yarrow.hir.Value;
import com.kelthuzadx.yarrow.util.Logger;
import jdk.vm.ci.meta.JavaKind;

public class ArrayLenInstr extends AccessArrayInstr {

    public ArrayLenInstr(HirInstr array) {
        super(new Value(JavaKind.Int), array);
    }

    @Override
    public HirInstr ideal() {
        // Object[] arr = new Object[3];
        // int p = arr.length;
        if (array instanceof NewTypeArrayInstr) {
            HirInstr lenInstr = ((NewTypeArrayInstr) array).arrayLength();
            if (lenInstr instanceof ConstantInstr) {
                int len = ((ConstantInstr) lenInstr).value();
                return new ConstantInstr(new Value(JavaKind.Int, len));
            }
        } else if (array instanceof NewObjectArrayInstr) {
            HirInstr lenInstr = ((NewObjectArrayInstr) array).arrayLength();
            if (lenInstr instanceof ConstantInstr) {
                int len = ((ConstantInstr) lenInstr).value();
                return new ConstantInstr(new Value(JavaKind.Int, len));
            }
        }
        return super.ideal();
    }

    @Override
    public String toString() {
        return Logger.format("i{}: i{}.length", super.id, super.array.id);
    }
}
