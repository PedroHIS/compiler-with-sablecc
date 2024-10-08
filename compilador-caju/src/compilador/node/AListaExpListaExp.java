/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import java.util.*;
import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AListaExpListaExp extends PListaExp
{
    private PExp _exp_;
    private final LinkedList<PMultiplosExp> _multiplosExp_ = new LinkedList<PMultiplosExp>();

    public AListaExpListaExp()
    {
        // Constructor
    }

    public AListaExpListaExp(
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") List<?> _multiplosExp_)
    {
        // Constructor
        setExp(_exp_);

        setMultiplosExp(_multiplosExp_);

    }

    @Override
    public Object clone()
    {
        return new AListaExpListaExp(
            cloneNode(this._exp_),
            cloneList(this._multiplosExp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAListaExpListaExp(this);
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public LinkedList<PMultiplosExp> getMultiplosExp()
    {
        return this._multiplosExp_;
    }

    public void setMultiplosExp(List<?> list)
    {
        for(PMultiplosExp e : this._multiplosExp_)
        {
            e.parent(null);
        }
        this._multiplosExp_.clear();

        for(Object obj_e : list)
        {
            PMultiplosExp e = (PMultiplosExp) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._multiplosExp_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._exp_)
            + toString(this._multiplosExp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._multiplosExp_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        for(ListIterator<PMultiplosExp> i = this._multiplosExp_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PMultiplosExp) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
