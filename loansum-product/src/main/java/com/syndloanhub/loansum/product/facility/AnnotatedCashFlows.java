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
import org.joda.beans.Bean;
import org.joda.beans.JodaBeanUtils;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectFieldsBeanBuilder;
import org.joda.beans.impl.direct.DirectMetaBean;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.joda.beans.impl.direct.DirectMetaPropertyMap;
import org.joda.beans.MetaBean;
import org.joda.beans.gen.BeanDefinition;
import org.joda.beans.gen.PropertyDefinition;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * A collection of annotated cash flows.
 */
@BeanDefinition
public final class AnnotatedCashFlows implements ImmutableBean {

  /**
   * List of annotated cash flows.
   */
  @PropertyDefinition(validate = "notEmpty", builderType = "List<? extends AnnotatedCashFlow>")
  private final ImmutableList<AnnotatedCashFlow> cashFlows;

  //------------------------- AUTOGENERATED START -------------------------
  /**
   * The meta-bean for {@code AnnotatedCashFlows}.
   * @return the meta-bean, not null
   */
  public static AnnotatedCashFlows.Meta meta() {
    return AnnotatedCashFlows.Meta.INSTANCE;
  }

  static {
    MetaBean.register(AnnotatedCashFlows.Meta.INSTANCE);
  }

  /**
   * Returns a builder used to create an instance of the bean.
   * @return the builder, not null
   */
  public static AnnotatedCashFlows.Builder builder() {
    return new AnnotatedCashFlows.Builder();
  }

  private AnnotatedCashFlows(
      List<? extends AnnotatedCashFlow> cashFlows) {
    JodaBeanUtils.notEmpty(cashFlows, "cashFlows");
    this.cashFlows = ImmutableList.copyOf(cashFlows);
  }

  @Override
  public AnnotatedCashFlows.Meta metaBean() {
    return AnnotatedCashFlows.Meta.INSTANCE;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets list of annotated cash flows.
   * @return the value of the property, not empty
   */
  public ImmutableList<AnnotatedCashFlow> getCashFlows() {
    return cashFlows;
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
      AnnotatedCashFlows other = (AnnotatedCashFlows) obj;
      return JodaBeanUtils.equal(cashFlows, other.cashFlows);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(cashFlows);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(64);
    buf.append("AnnotatedCashFlows{");
    buf.append("cashFlows").append('=').append(JodaBeanUtils.toString(cashFlows));
    buf.append('}');
    return buf.toString();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code AnnotatedCashFlows}.
   */
  public static final class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code cashFlows} property.
     */
    @SuppressWarnings({"unchecked", "rawtypes" })
    private final MetaProperty<ImmutableList<AnnotatedCashFlow>> _cashFlows = DirectMetaProperty.ofImmutable(
        this, "cashFlows", AnnotatedCashFlows.class, (Class) ImmutableList.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> _metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "cashFlows");

    /**
     * Restricted constructor.
     */
    private Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case 733659538:  // cashFlows
          return _cashFlows;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public AnnotatedCashFlows.Builder builder() {
      return new AnnotatedCashFlows.Builder();
    }

    @Override
    public Class<? extends AnnotatedCashFlows> beanType() {
      return AnnotatedCashFlows.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return _metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code cashFlows} property.
     * @return the meta-property, not null
     */
    public MetaProperty<ImmutableList<AnnotatedCashFlow>> cashFlows() {
      return _cashFlows;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case 733659538:  // cashFlows
          return ((AnnotatedCashFlows) bean).getCashFlows();
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
   * The bean-builder for {@code AnnotatedCashFlows}.
   */
  public static final class Builder extends DirectFieldsBeanBuilder<AnnotatedCashFlows> {

    private List<? extends AnnotatedCashFlow> cashFlows = ImmutableList.of();

    /**
     * Restricted constructor.
     */
    private Builder() {
    }

    /**
     * Restricted copy constructor.
     * @param beanToCopy  the bean to copy from, not null
     */
    private Builder(AnnotatedCashFlows beanToCopy) {
      this.cashFlows = beanToCopy.getCashFlows();
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case 733659538:  // cashFlows
          return cashFlows;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @SuppressWarnings("unchecked")
    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case 733659538:  // cashFlows
          this.cashFlows = (List<? extends AnnotatedCashFlow>) newValue;
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
    public AnnotatedCashFlows build() {
      return new AnnotatedCashFlows(
          cashFlows);
    }

    //-----------------------------------------------------------------------
    /**
     * Sets list of annotated cash flows.
     * @param cashFlows  the new value, not empty
     * @return this, for chaining, not null
     */
    public Builder cashFlows(List<? extends AnnotatedCashFlow> cashFlows) {
      JodaBeanUtils.notEmpty(cashFlows, "cashFlows");
      this.cashFlows = cashFlows;
      return this;
    }

    /**
     * Sets the {@code cashFlows} property in the builder
     * from an array of objects.
     * @param cashFlows  the new value, not empty
     * @return this, for chaining, not null
     */
    public Builder cashFlows(AnnotatedCashFlow... cashFlows) {
      return cashFlows(ImmutableList.copyOf(cashFlows));
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(64);
      buf.append("AnnotatedCashFlows.Builder{");
      buf.append("cashFlows").append('=').append(JodaBeanUtils.toString(cashFlows));
      buf.append('}');
      return buf.toString();
    }

  }

  //-------------------------- AUTOGENERATED END --------------------------
}
