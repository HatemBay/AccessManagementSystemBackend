package com.accessSystem.demand;

import com.accessSystem.user.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Demand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @ManyToOne(fetch = FetchType.LAZY)
    User user;
    String concernedSite;
    String concernedLocal;
    String demandObject;
    Choice equipmentAdd;
    Choice equipmentRecovery;
    Date visitDayStart;
    Date visitDayEnd;
    String visitDateStart;
    String visitDateEnd;
    Boolean state;
    String refusalReason;
    String notes;
    Date created_at;
    Date updated_at;

    public Demand() {
    }

    public Demand(User user, String concernedSite, String concernedLocal, String demandObject, Choice equipmentAdd, Choice equipmentRecovery, Date visitDayStart, Date visitDayEnd, String visitDateStart, String visitDateEnd, Boolean state, String refusalReason, String notes, Date created_at, Date updated_at) {
        this.user = user;
        this.concernedSite = concernedSite;
        this.concernedLocal = concernedLocal;
        this.demandObject = demandObject;
        this.equipmentAdd = equipmentAdd;
        this.equipmentRecovery = equipmentRecovery;
        this.visitDayStart = visitDayStart;
        this.visitDayEnd = visitDayEnd;
        this.visitDateStart = visitDateStart;
        this.visitDateEnd = visitDateEnd;
        this.state = state;
        this.refusalReason = refusalReason;
        this.notes = notes;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Demand(int id, User user, String concernedSite, String concernedLocal, String demandObject, Choice equipmentAdd, Choice equipmentRecovery, Date visitDayStart, Date visitDayEnd, String visitDateStart, String visitDateEnd, Boolean state, String refusalReason, String notes, Date created_at, Date updated_at) {
        this.id = id;
        this.user = user;
        this.concernedSite = concernedSite;
        this.concernedLocal = concernedLocal;
        this.demandObject = demandObject;
        this.equipmentAdd = equipmentAdd;
        this.equipmentRecovery = equipmentRecovery;
        this.visitDayStart = visitDayStart;
        this.visitDayEnd = visitDayEnd;
        this.visitDateStart = visitDateStart;
        this.visitDateEnd = visitDateEnd;
        this.state = state;
        this.refusalReason = refusalReason;
        this.notes = notes;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Demand(int id, User user, String concernedSite, String concernedLocal, String demandObject, Choice equipmentAdd, Choice equipmentRecovery, Date visitDayStart, Date visitDayEnd, String visitDateStart, String visitDateEnd, Boolean state, String refusalReason, String notes) {
        this.id = id;
        this.user = user;
        this.concernedSite = concernedSite;
        this.concernedLocal = concernedLocal;
        this.demandObject = demandObject;
        this.equipmentAdd = equipmentAdd;
        this.equipmentRecovery = equipmentRecovery;
        this.visitDayStart = visitDayStart;
        this.visitDayEnd = visitDayEnd;
        this.visitDateStart = visitDateStart;
        this.visitDateEnd = visitDateEnd;
        this.state = state;
        this.refusalReason = refusalReason;
        this.notes = notes;
    }

    public Demand(User user, String concernedSite, String concernedLocal, String demandObject, Choice equipmentAdd, Choice equipmentRecovery, Date visitDayStart, Date visitDayEnd, String visitDateStart, String visitDateEnd, String refusalReason, String notes) {
        this.user = user;
        this.concernedSite = concernedSite;
        this.concernedLocal = concernedLocal;
        this.demandObject = demandObject;
        this.equipmentAdd = equipmentAdd;
        this.equipmentRecovery = equipmentRecovery;
        this.visitDayStart = visitDayStart;
        this.visitDayEnd = visitDayEnd;
        this.visitDateStart = visitDateStart;
        this.visitDateEnd = visitDateEnd;
        this.refusalReason = refusalReason;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Demand{" +
                "id=" + id +
                ", user=" + user +
                ", concernedSite='" + concernedSite + '\'' +
                ", concernedLocal='" + concernedLocal + '\'' +
                ", demandObject='" + demandObject + '\'' +
                ", equipmentAdd=" + equipmentAdd +
                ", equipmentRecovery=" + equipmentRecovery +
                ", visitDayStart=" + visitDayStart +
                ", visitDayEnd=" + visitDayEnd +
                ", visitDateStart='" + visitDateStart + '\'' +
                ", visitDateEnd='" + visitDateEnd + '\'' +
                ", state='" + state + '\'' +
                ", refusalReason='" + refusalReason + '\'' +
                ", notes='" + notes + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demand demand = (Demand) o;
        return id == demand.id && Objects.equals(user, demand.user) && Objects.equals(concernedSite, demand.concernedSite) && Objects.equals(concernedLocal, demand.concernedLocal) && Objects.equals(demandObject, demand.demandObject) && equipmentAdd == demand.equipmentAdd && equipmentRecovery == demand.equipmentRecovery && Objects.equals(visitDayStart, demand.visitDayStart) && Objects.equals(visitDayEnd, demand.visitDayEnd) && Objects.equals(visitDateStart, demand.visitDateStart) && Objects.equals(visitDateEnd, demand.visitDateEnd) && Objects.equals(state, demand.state) && Objects.equals(refusalReason, demand.refusalReason) && Objects.equals(notes, demand.notes) && Objects.equals(created_at, demand.created_at) && Objects.equals(updated_at, demand.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, concernedSite, concernedLocal, demandObject, equipmentAdd, equipmentRecovery, visitDayStart, visitDayEnd, visitDateStart, visitDateEnd, state, refusalReason, notes, created_at, updated_at);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getConcernedSite() {
        return concernedSite;
    }

    public void setConcernedSite(String concernedSite) {
        this.concernedSite = concernedSite;
    }

    public String getConcernedLocal() {
        return concernedLocal;
    }

    public void setConcernedLocal(String concernedLocal) {
        this.concernedLocal = concernedLocal;
    }

    public String getDemandObject() {
        return demandObject;
    }

    public void setDemandObject(String demandObject) {
        this.demandObject = demandObject;
    }

    public Choice getEquipmentAdd() {
        return equipmentAdd;
    }

    public void setEquipmentAdd(Choice equipmentAdd) {
        this.equipmentAdd = equipmentAdd;
    }

    public Choice getEquipmentRecovery() {
        return equipmentRecovery;
    }

    public void setEquipmentRecovery(Choice equipmentRecovery) {
        this.equipmentRecovery = equipmentRecovery;
    }

    public Date getVisitDayStart() {
        return visitDayStart;
    }

    public void setVisitDayStart(Date visitDayStart) {
        this.visitDayStart = visitDayStart;
    }

    public Date getVisitDayEnd() {
        return visitDayEnd;
    }

    public void setVisitDayEnd(Date visitDayEnd) {
        this.visitDayEnd = visitDayEnd;
    }

    public String getVisitDateStart() {
        return visitDateStart;
    }

    public void setVisitDateStart(String visitDateStart) {
        this.visitDateStart = visitDateStart;
    }

    public String getVisitDateEnd() {
        return visitDateEnd;
    }

    public void setVisitDateEnd(String visitDateEnd) {
        this.visitDateEnd = visitDateEnd;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getRefusalReason() {
        return refusalReason;
    }

    public void setRefusalReason(String refusalReason) {
        this.refusalReason = refusalReason;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
