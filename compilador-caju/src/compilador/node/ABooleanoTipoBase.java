/* This file was generated by SableCC (http://www.sablecc.org/). */

package compilador.node;

import compilador.analysis.*;

@SuppressWarnings("nls")
public final class ABooleanoTipoBase extends PTipoBase
{
    private TTipoBooleano _tipoBooleano_;

    public ABooleanoTipoBase()
    {
        // Constructor
    }

    public ABooleanoTipoBase(
        @SuppressWarnings("hiding") TTipoBooleano _tipoBooleano_)
    {
        // Constructor
        setTipoBooleano(_tipoBooleano_);

    }

    @Override
    public Object clone()
    {
        return new ABooleanoTipoBase(
            cloneNode(this._tipoBooleano_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABooleanoTipoBase(this);
    }

    public TTipoBooleano getTipoBooleano()
    {
        return this._tipoBooleano_;
    }

    public void setTipoBooleano(TTipoBooleano node)
    {
        if(this._tipoBooleano_ != null)
        {
            this._tipoBooleano_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoBooleano_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tipoBooleano_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tipoBooleano_ == child)
        {
            this._tipoBooleano_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tipoBooleano_ == oldChild)
        {
            setTipoBooleano((TTipoBooleano) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
