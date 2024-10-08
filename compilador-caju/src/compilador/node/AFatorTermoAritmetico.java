/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class AFatorTermoAritmetico extends PTermoAritmetico
{
    private PFatorAritmetico _fatorAritmetico_;

    public AFatorTermoAritmetico()
    {
        // Constructor
    }

    public AFatorTermoAritmetico(
        @SuppressWarnings("hiding") PFatorAritmetico _fatorAritmetico_)
    {
        // Constructor
        setFatorAritmetico(_fatorAritmetico_);

    }

    @Override
    public Object clone()
    {
        return new AFatorTermoAritmetico(
            cloneNode(this._fatorAritmetico_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFatorTermoAritmetico(this);
    }

    public PFatorAritmetico getFatorAritmetico()
    {
        return this._fatorAritmetico_;
    }

    public void setFatorAritmetico(PFatorAritmetico node)
    {
        if(this._fatorAritmetico_ != null)
        {
            this._fatorAritmetico_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fatorAritmetico_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fatorAritmetico_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fatorAritmetico_ == child)
        {
            this._fatorAritmetico_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fatorAritmetico_ == oldChild)
        {
            setFatorAritmetico((PFatorAritmetico) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
