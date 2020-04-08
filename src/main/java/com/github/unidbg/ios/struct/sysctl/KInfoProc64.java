package com.github.unidbg.ios.struct.sysctl;

import com.github.unidbg.pointer.UnicornStructure;
import com.sun.jna.Pointer;

import java.util.Arrays;
import java.util.List;

/**
 * kinfo_proc
 */
public class KInfoProc64 extends UnicornStructure {

    public KInfoProc64(Pointer p) {
        super(p);
    }

    public ExternProc64 kp_proc; /* proc structure */
    public EProc kp_eproc;

    @Override
    protected List<String> getFieldOrder() {
        return Arrays.asList("kp_proc", "kp_eproc");
    }

}
