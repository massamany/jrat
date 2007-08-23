package org.shiftone.jrat.provider.tree.ui;

import org.shiftone.jrat.core.spi.ViewBuilder;
import org.shiftone.jrat.provider.tree.StackNode;

import javax.swing.JComponent;
import java.io.File;
import java.util.Set;
import java.util.HashSet;

/**
 * @Author Jeff Drost
 */
public class TreeViewBuilder implements ViewBuilder { //, Externalizable {

    private static final long serialVersionUID = 1;
    private StackNode root;
    private Set allMethodKeys;
    private long sessionStartMs;
    private long sessionEndMs;

    public TreeViewBuilder() {
    }


    public TreeViewBuilder(StackNode root, Set allMethodKeys, long sessionStartMs, long sessionEndMs) {
        this.root = root;
        this.allMethodKeys = allMethodKeys;
        this.sessionStartMs = sessionStartMs;
        this.sessionEndMs = sessionEndMs;
    }

    public JComponent buildView(File source) throws Exception {
        return new MainViewPanel(root, allMethodKeys, sessionStartMs, sessionEndMs);
    }

//
//    public void writeExternal(ObjectOutput out) throws IOException {
//        root.writeExternal(out);
//    }
//
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//        root = new StackNode();
//        root.readExternal(in);
//    }
}
