/**
 * Copyright (c) 2018 SyndLoanHub, LLC and contributors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License from within this distribution and at:
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 */

package com.syndloanhub.loansum.product.facility;

import org.joda.beans.ImmutableBean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;
import org.joda.beans.Bean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.MetaBean;
import org.joda.beans.gen.BeanDefinition;
import org.joda.beans.gen.PropertyDefinition;

import com.opengamma.strata.market.amount.CashFlow;

import java.util.Map;
import java.util.NoSuchElementException;

/**
 * A basic cash flow annotated with additional information needed for reporting.
 */
@BeanDefinition
public final class AnnotatedCashFlow implements ImmutableBean {

  /**
   * The cash flow annotations.
   */
  @PropertyDefinition(validate = "notNull")
  private final CashFlowAnnotations annotation;

  /**
   * The cash flow.
   */
  @PropertyDefinition(validate = "notNull")
  private final CashFlow cashFlow;

  //------------------------- AUTOGENERATED START -------------------------
  /**
   * The meta-bean for {@code AnnotatedCashFlow}.
   * @return the meta-bean, not null
   */
  public static AnnotatedCashFlow.Meta meta() {
    return AnnotatedCashFlow.Meta.INSTANCE;
  }

  static {
    MetaBean.register(AnnotatedCashFlow.Meta.INSTANCE);
  }

  /**
   * Returns a builder used to create an instance of the bean.
   * @return the builder, not null
   */
  public static AnnotatedCashFlow.Builder builder() {
    return new AnnotatedCashFlow.Builder();
  }

  private AnnotatedCashFlow(
      CashFlowAnnotations annotation,
      CashFlow cashFlow) {
    JodaBeanUtils.notNull(annotation, "annotation");
    JodaBeanUtils.notNull(cashFlow, "cashFlow");
    this.annotation = annotation;
    this.cashFlow = cashFlow;
  }

  @Override
  public AnnotatedCashFlow.Meta metaBean() {
    return AnnotatedCashFlow.Meta.INSTANCE;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the cash flow annotations.
   * @return the value of the property, not null
   */
  public CashFlowAnnotations getAnnotation() {
    return annotation;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the cash flow.
   * @return the value of the property, not null
   */
  public CashFlow getCashFlow() {
    return cashFlow;
  }

  //-----------------------------------------------------------------------
  /**
   * Returns a builder that allows this bean to be mutated.
   * @return the mutable builder, not null
   */
  public Builder toBuilder() {
    return new Builder(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj != null && obj.getClass() == this.getClass()) {
      AnnotatedCashFlow other = (AnnotatedCashFlow) obj;
      return JodaBeanUtils.equal(annotation, other.annotation) &&
          JodaBeanUtils.equal(cashFlow, other.cashFlow);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(annotation);
    hash = hash * 31 + JodaBeanUtils.hashCode(cashFlow);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(96);
    buf.append("AnnotatedCashFlow{");
    buf.append("annotation").append('=').append(annotation).append(',').append(' ');
    buf.append("cashFlow").append('=').append(JodaBeanUtils.toString(cashFlow));
    buf.append('}');
    return buf.toString();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code AnnotatedCashFlow}.
   */
  public static final class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code annotation} property.
     */
    private final MetaProperty<CashFlowAnnotations> _annotation = DirectMetaProperty.ofImmutable(
        this, "annotation", AnnotatedCashFlow.class, CashFlowAnnotations.class);
    /**
     * The meta-property for the {@code cashFlow} property.
     */
    private final MetaProperty<CashFlow> _cashFlow = DirectMetaProperty.ofImmutable(
        this, "cashFlow", AnnotatedCashFlow.class, CashFlow.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> _metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "annotation",
        "cashFlow");

    /**
     * Restricted constructor.
     */
    private Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case -1555043537:  // annotation
          return _annotation;
        case 23666433:  // cashFlow
          return _cashFlow;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public AnnotatedCashFlow.Builder builder() {
      return new AnnotatedCashFlow.Builder();
    }

    @Override
    public Class<? extends AnnotatedCashFlow> beanType() {
      return AnnotatedCashFlow.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return _metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code annotation} property.
     * @return the meta-property, not null
     */
    public MetaProperty<CashFlowAnnotations> annotation() {
      return _annotation;
    }

    /**
     * The meta-property for the {@code cashFlow} property.
     * @return the meta-property, not null
     */
    public MetaProperty<CashFlow> cashFlow() {
      return _cashFlow;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case -1555043537:  // annotation
          return ((AnnotatedCashFlow) bean).getAnnotation();
        case 23666433:  // cashFlow
          return ((AnnotatedCashFlow) bean).getCashFlow();
      }
      return super.propertyGet(bean, propertyName, quiet);
    }

    @Override
    protected void propertySet(Bean bean, String propertyName, Object newValue, boolean quiet) {
      metaProperty(propertyName);
      if (quiet) {
        return;
      }
      throw new UnsupportedOperationException("Property cannot be written: " + propertyName);
    }

  }

  //-----------------------------------------------------------------------
  /**
   * The bean-builder for {@code AnnotatedCashFlow}.
   */
  public static final class Builder extends DirectFieldsBeanBuilder<AnnotatedCashFlow> {

    private CashFlowAnnotations annotation;
    private CashFlow cashFlow;

    /**
     * Restricted constructor.
     */
    private Builder() {
    }

    /**
     * Restricted copy constructor.
     * @param beanToCopy  the bean to copy from, not null
     */
    private Builder(AnnotatedCashFlow beanToCopy) {
      this.annotation = beanToCopy.getAnnotation();
      this.cashFlow = beanToCopy.getCashFlow();
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case -1555043537:  // annotation
          return annotation;
        case 23666433:  // cashFlow
          return cashFlow;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case -1555043537:  // annotation
          this.annotation = (CashFlowAnnotations) newValue;
          break;
        case 23666433:  // cashFlow
          this.cashFlow = (CashFlow) newValue;
          break;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
      return this;
    }

    @Override
    public Builder set(MetaProperty<?> property, Object value) {
      super.set(property, value);
      return this;
    }

    @Override
    public AnnotatedCashFlow build() {
      return new AnnotatedCashFlow(
          annotation,
          cashFlow);
    }

    //-----------------------------------------------------------------------
    /**
     * Sets the cash flow annotations.
     * @param annotation  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder annotation(CashFlowAnnotations annotation) {
      JodaBeanUtils.notNull(annotation, "annotation");
      this.annotation = annotation;
      return this;
    }

    /**
     * Sets the cash flow.
     * @param cashFlow  the new value, not null
     * @return this, for chaining, not null
     */
    public Builder cashFlow(CashFlow cashFlow) {
      JodaBeanUtils.notNull(cashFlow, "cashFlow");
      this.cashFlow = cashFlow;
      return this;
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(96);
      buf.append("AnnotatedCashFlow.Builder{");
      buf.append("annotation").append('=').append(JodaBeanUtils.toString(annotation)).append(',').append(' ');
      buf.append("cashFlow").append('=').append(JodaBeanUtils.toString(cashFlow));
      buf.append('}');
      return buf.toString();
    }

  }

  //-------------------------- AUTOGENERATED END --------------------------
}
