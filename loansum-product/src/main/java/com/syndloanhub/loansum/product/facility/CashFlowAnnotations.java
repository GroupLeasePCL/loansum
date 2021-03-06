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

import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.market.explain.ExplainMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * A number of attributes used to annotate raw cash flows to assist in reporting.
 */
@BeanDefinition
public final class CashFlowAnnotations implements ImmutableBean {

  /**
   * Entity (e.g. contract, fee) source of cash flow
   */
  @PropertyDefinition(validate = "")
  private final StandardId source;

  /**
   * True if value is uncertain, e.g. estimated delayed comp on unsettled
   * trade.
   */
  @PropertyDefinition(validate = "")
  private final boolean uncertain;

  /**
   * Cash flow type, e.g. Principal, Interest, etc.
   */
  @PropertyDefinition(validate = "")
  private final CashFlowType type;

  /**
   * The paying counter party
   */
  @PropertyDefinition(validate = "")
  private final StandardId payingCounterparty;

  /**
   * The receiving counter party
   */
  @PropertyDefinition(validate = "")
  private final StandardId receivingCounterparty;

  /**
   * The explain map of this cash flow.
   */
  @PropertyDefinition(get = "optional")
  private final ExplainMap explains;

  //------------------------- AUTOGENERATED START -------------------------
  /**
   * The meta-bean for {@code CashFlowAnnotations}.
   * @return the meta-bean, not null
   */
  public static CashFlowAnnotations.Meta meta() {
    return CashFlowAnnotations.Meta.INSTANCE;
  }

  static {
    MetaBean.register(CashFlowAnnotations.Meta.INSTANCE);
  }

  /**
   * Returns a builder used to create an instance of the bean.
   * @return the builder, not null
   */
  public static CashFlowAnnotations.Builder builder() {
    return new CashFlowAnnotations.Builder();
  }

  private CashFlowAnnotations(
      StandardId source,
      boolean uncertain,
      CashFlowType type,
      StandardId payingCounterparty,
      StandardId receivingCounterparty,
      ExplainMap explains) {
    this.source = source;
    this.uncertain = uncertain;
    this.type = type;
    this.payingCounterparty = payingCounterparty;
    this.receivingCounterparty = receivingCounterparty;
    this.explains = explains;
  }

  @Override
  public CashFlowAnnotations.Meta metaBean() {
    return CashFlowAnnotations.Meta.INSTANCE;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets entity (e.g. contract, fee) source of cash flow
   * @return the value of the property
   */
  public StandardId getSource() {
    return source;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets true if value is uncertain, e.g. estimated delayed comp on unsettled
   * trade.
   * @return the value of the property
   */
  public boolean isUncertain() {
    return uncertain;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets cash flow type, e.g. Principal, Interest, etc.
   * @return the value of the property
   */
  public CashFlowType getType() {
    return type;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the paying counter party
   * @return the value of the property
   */
  public StandardId getPayingCounterparty() {
    return payingCounterparty;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the receiving counter party
   * @return the value of the property
   */
  public StandardId getReceivingCounterparty() {
    return receivingCounterparty;
  }

  //-----------------------------------------------------------------------
  /**
   * Gets the explain map of this cash flow.
   * @return the optional value of the property, not null
   */
  public Optional<ExplainMap> getExplains() {
    return Optional.ofNullable(explains);
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
      CashFlowAnnotations other = (CashFlowAnnotations) obj;
      return JodaBeanUtils.equal(source, other.source) &&
          (uncertain == other.uncertain) &&
          JodaBeanUtils.equal(type, other.type) &&
          JodaBeanUtils.equal(payingCounterparty, other.payingCounterparty) &&
          JodaBeanUtils.equal(receivingCounterparty, other.receivingCounterparty) &&
          JodaBeanUtils.equal(explains, other.explains);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int hash = getClass().hashCode();
    hash = hash * 31 + JodaBeanUtils.hashCode(source);
    hash = hash * 31 + JodaBeanUtils.hashCode(uncertain);
    hash = hash * 31 + JodaBeanUtils.hashCode(type);
    hash = hash * 31 + JodaBeanUtils.hashCode(payingCounterparty);
    hash = hash * 31 + JodaBeanUtils.hashCode(receivingCounterparty);
    hash = hash * 31 + JodaBeanUtils.hashCode(explains);
    return hash;
  }

  @Override
  public String toString() {
    StringBuilder buf = new StringBuilder(224);
    buf.append("CashFlowAnnotations{");
    buf.append("source").append('=').append(source).append(',').append(' ');
    buf.append("uncertain").append('=').append(uncertain).append(',').append(' ');
    buf.append("type").append('=').append(type).append(',').append(' ');
    buf.append("payingCounterparty").append('=').append(payingCounterparty).append(',').append(' ');
    buf.append("receivingCounterparty").append('=').append(receivingCounterparty).append(',').append(' ');
    buf.append("explains").append('=').append(JodaBeanUtils.toString(explains));
    buf.append('}');
    return buf.toString();
  }

  //-----------------------------------------------------------------------
  /**
   * The meta-bean for {@code CashFlowAnnotations}.
   */
  public static final class Meta extends DirectMetaBean {
    /**
     * The singleton instance of the meta-bean.
     */
    static final Meta INSTANCE = new Meta();

    /**
     * The meta-property for the {@code source} property.
     */
    private final MetaProperty<StandardId> _source = DirectMetaProperty.ofImmutable(
        this, "source", CashFlowAnnotations.class, StandardId.class);
    /**
     * The meta-property for the {@code uncertain} property.
     */
    private final MetaProperty<Boolean> _uncertain = DirectMetaProperty.ofImmutable(
        this, "uncertain", CashFlowAnnotations.class, Boolean.TYPE);
    /**
     * The meta-property for the {@code type} property.
     */
    private final MetaProperty<CashFlowType> _type = DirectMetaProperty.ofImmutable(
        this, "type", CashFlowAnnotations.class, CashFlowType.class);
    /**
     * The meta-property for the {@code payingCounterparty} property.
     */
    private final MetaProperty<StandardId> _payingCounterparty = DirectMetaProperty.ofImmutable(
        this, "payingCounterparty", CashFlowAnnotations.class, StandardId.class);
    /**
     * The meta-property for the {@code receivingCounterparty} property.
     */
    private final MetaProperty<StandardId> _receivingCounterparty = DirectMetaProperty.ofImmutable(
        this, "receivingCounterparty", CashFlowAnnotations.class, StandardId.class);
    /**
     * The meta-property for the {@code explains} property.
     */
    private final MetaProperty<ExplainMap> _explains = DirectMetaProperty.ofImmutable(
        this, "explains", CashFlowAnnotations.class, ExplainMap.class);
    /**
     * The meta-properties.
     */
    private final Map<String, MetaProperty<?>> _metaPropertyMap$ = new DirectMetaPropertyMap(
        this, null,
        "source",
        "uncertain",
        "type",
        "payingCounterparty",
        "receivingCounterparty",
        "explains");

    /**
     * Restricted constructor.
     */
    private Meta() {
    }

    @Override
    protected MetaProperty<?> metaPropertyGet(String propertyName) {
      switch (propertyName.hashCode()) {
        case -896505829:  // source
          return _source;
        case -1914236951:  // uncertain
          return _uncertain;
        case 3575610:  // type
          return _type;
        case -1266469436:  // payingCounterparty
          return _payingCounterparty;
        case -1431139990:  // receivingCounterparty
          return _receivingCounterparty;
        case -1929323940:  // explains
          return _explains;
      }
      return super.metaPropertyGet(propertyName);
    }

    @Override
    public CashFlowAnnotations.Builder builder() {
      return new CashFlowAnnotations.Builder();
    }

    @Override
    public Class<? extends CashFlowAnnotations> beanType() {
      return CashFlowAnnotations.class;
    }

    @Override
    public Map<String, MetaProperty<?>> metaPropertyMap() {
      return _metaPropertyMap$;
    }

    //-----------------------------------------------------------------------
    /**
     * The meta-property for the {@code source} property.
     * @return the meta-property, not null
     */
    public MetaProperty<StandardId> source() {
      return _source;
    }

    /**
     * The meta-property for the {@code uncertain} property.
     * @return the meta-property, not null
     */
    public MetaProperty<Boolean> uncertain() {
      return _uncertain;
    }

    /**
     * The meta-property for the {@code type} property.
     * @return the meta-property, not null
     */
    public MetaProperty<CashFlowType> type() {
      return _type;
    }

    /**
     * The meta-property for the {@code payingCounterparty} property.
     * @return the meta-property, not null
     */
    public MetaProperty<StandardId> payingCounterparty() {
      return _payingCounterparty;
    }

    /**
     * The meta-property for the {@code receivingCounterparty} property.
     * @return the meta-property, not null
     */
    public MetaProperty<StandardId> receivingCounterparty() {
      return _receivingCounterparty;
    }

    /**
     * The meta-property for the {@code explains} property.
     * @return the meta-property, not null
     */
    public MetaProperty<ExplainMap> explains() {
      return _explains;
    }

    //-----------------------------------------------------------------------
    @Override
    protected Object propertyGet(Bean bean, String propertyName, boolean quiet) {
      switch (propertyName.hashCode()) {
        case -896505829:  // source
          return ((CashFlowAnnotations) bean).getSource();
        case -1914236951:  // uncertain
          return ((CashFlowAnnotations) bean).isUncertain();
        case 3575610:  // type
          return ((CashFlowAnnotations) bean).getType();
        case -1266469436:  // payingCounterparty
          return ((CashFlowAnnotations) bean).getPayingCounterparty();
        case -1431139990:  // receivingCounterparty
          return ((CashFlowAnnotations) bean).getReceivingCounterparty();
        case -1929323940:  // explains
          return ((CashFlowAnnotations) bean).explains;
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
   * The bean-builder for {@code CashFlowAnnotations}.
   */
  public static final class Builder extends DirectFieldsBeanBuilder<CashFlowAnnotations> {

    private StandardId source;
    private boolean uncertain;
    private CashFlowType type;
    private StandardId payingCounterparty;
    private StandardId receivingCounterparty;
    private ExplainMap explains;

    /**
     * Restricted constructor.
     */
    private Builder() {
    }

    /**
     * Restricted copy constructor.
     * @param beanToCopy  the bean to copy from, not null
     */
    private Builder(CashFlowAnnotations beanToCopy) {
      this.source = beanToCopy.getSource();
      this.uncertain = beanToCopy.isUncertain();
      this.type = beanToCopy.getType();
      this.payingCounterparty = beanToCopy.getPayingCounterparty();
      this.receivingCounterparty = beanToCopy.getReceivingCounterparty();
      this.explains = beanToCopy.explains;
    }

    //-----------------------------------------------------------------------
    @Override
    public Object get(String propertyName) {
      switch (propertyName.hashCode()) {
        case -896505829:  // source
          return source;
        case -1914236951:  // uncertain
          return uncertain;
        case 3575610:  // type
          return type;
        case -1266469436:  // payingCounterparty
          return payingCounterparty;
        case -1431139990:  // receivingCounterparty
          return receivingCounterparty;
        case -1929323940:  // explains
          return explains;
        default:
          throw new NoSuchElementException("Unknown property: " + propertyName);
      }
    }

    @Override
    public Builder set(String propertyName, Object newValue) {
      switch (propertyName.hashCode()) {
        case -896505829:  // source
          this.source = (StandardId) newValue;
          break;
        case -1914236951:  // uncertain
          this.uncertain = (Boolean) newValue;
          break;
        case 3575610:  // type
          this.type = (CashFlowType) newValue;
          break;
        case -1266469436:  // payingCounterparty
          this.payingCounterparty = (StandardId) newValue;
          break;
        case -1431139990:  // receivingCounterparty
          this.receivingCounterparty = (StandardId) newValue;
          break;
        case -1929323940:  // explains
          this.explains = (ExplainMap) newValue;
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
    public CashFlowAnnotations build() {
      return new CashFlowAnnotations(
          source,
          uncertain,
          type,
          payingCounterparty,
          receivingCounterparty,
          explains);
    }

    //-----------------------------------------------------------------------
    /**
     * Sets entity (e.g. contract, fee) source of cash flow
     * @param source  the new value
     * @return this, for chaining, not null
     */
    public Builder source(StandardId source) {
      this.source = source;
      return this;
    }

    /**
     * Sets true if value is uncertain, e.g. estimated delayed comp on unsettled
     * trade.
     * @param uncertain  the new value
     * @return this, for chaining, not null
     */
    public Builder uncertain(boolean uncertain) {
      this.uncertain = uncertain;
      return this;
    }

    /**
     * Sets cash flow type, e.g. Principal, Interest, etc.
     * @param type  the new value
     * @return this, for chaining, not null
     */
    public Builder type(CashFlowType type) {
      this.type = type;
      return this;
    }

    /**
     * Sets the paying counter party
     * @param payingCounterparty  the new value
     * @return this, for chaining, not null
     */
    public Builder payingCounterparty(StandardId payingCounterparty) {
      this.payingCounterparty = payingCounterparty;
      return this;
    }

    /**
     * Sets the receiving counter party
     * @param receivingCounterparty  the new value
     * @return this, for chaining, not null
     */
    public Builder receivingCounterparty(StandardId receivingCounterparty) {
      this.receivingCounterparty = receivingCounterparty;
      return this;
    }

    /**
     * Sets the explain map of this cash flow.
     * @param explains  the new value
     * @return this, for chaining, not null
     */
    public Builder explains(ExplainMap explains) {
      this.explains = explains;
      return this;
    }

    //-----------------------------------------------------------------------
    @Override
    public String toString() {
      StringBuilder buf = new StringBuilder(224);
      buf.append("CashFlowAnnotations.Builder{");
      buf.append("source").append('=').append(JodaBeanUtils.toString(source)).append(',').append(' ');
      buf.append("uncertain").append('=').append(JodaBeanUtils.toString(uncertain)).append(',').append(' ');
      buf.append("type").append('=').append(JodaBeanUtils.toString(type)).append(',').append(' ');
      buf.append("payingCounterparty").append('=').append(JodaBeanUtils.toString(payingCounterparty)).append(',').append(' ');
      buf.append("receivingCounterparty").append('=').append(JodaBeanUtils.toString(receivingCounterparty)).append(',').append(' ');
      buf.append("explains").append('=').append(JodaBeanUtils.toString(explains));
      buf.append('}');
      return buf.toString();
    }

  }

  //-------------------------- AUTOGENERATED END --------------------------
}
