package com.pl.premier_zone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="player_statistic")
public class Player {
    @Id
    @Column(name = "player_name") // Was "name"
    private String name;

    @Column(name = "nation")
    private String nation;

    @Column(name = "position")
    private String position;

    @Column(name = "age")
    private Integer age;

    @Column(name = "matches_played") // Was "mp"
    private Integer mp;

    @Column(name = "starts")
    private Integer starts;

    @Column(name = "minutes_played") // Was "min"
    private Double min;

    @Column(name = "goals")
    private Double goals;

    @Column(name = "assists") // Was "ast"
    private Double ast;

    @Column(name = "penalties_scored") // Was "pk"
    private Double pk;

    @Column(name = "yellow_cards") // Was "crdy"
    private Double crdy;

    @Column(name = "red_cards") // Was "crdr"
    private Double crdr;

    @Column(name = "expected_goals") // Was "xg"
    private Double xg;

    @Column(name = "expected_assists") // Was "xag"
    private Double xag;

    @Column(name = "team_name") // Was "team"
    private String team;

    public Player() {
    }

    public Player(String name, String nation, String position, Integer age, Integer mp, Integer starts, Double min, Double goals, Double ast, Double pk, Double crdy, Double crdr, Double xg, Double xag, String team) {
        this.name = name;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.goals = goals;
        this.ast = ast;
        this.pk = pk;
        this.crdy = crdy;
        this.crdr = crdr;
        this.xg = xg;
        this.xag = xag;
        this.team = team;
    }

    @SuppressWarnings("unused")
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @SuppressWarnings("unused")
    public Integer getAge() {
        return age;
    }
    @SuppressWarnings("unused")
    public void setAge(Integer age) {
        this.age = age;
    }
    @SuppressWarnings("unused")
    public Integer getMp() {
        return mp;
    }
    @SuppressWarnings("unused")
    public void setMp(Integer mp) {
        this.mp = mp;
    }
    @SuppressWarnings("unused")
    public Integer getStarts() {
        return starts;
    }
    @SuppressWarnings("unused")
    public void setStarts(Integer starts) {
        this.starts = starts;
    }
    @SuppressWarnings("unused")
    public Double getMin() {
        return min;
    }
    @SuppressWarnings("unused")
    public void setMin(Double min) {
        this.min = min;
    }
    @SuppressWarnings("unused")
    public Double getGoals() {
        return goals;
    }
    @SuppressWarnings("unused")
    public void setGoals(Double goals) {
        this.goals = goals;
    }
    @SuppressWarnings("unused")
    public Double getAst() {
        return ast;
    }
    @SuppressWarnings("unused")
    public void setAst(Double ast) {
        this.ast = ast;
    }
    @SuppressWarnings("unused")
    public Double getPk() {
        return pk;
    }
    @SuppressWarnings("unused")
    public void setPk(Double pk) {
        this.pk = pk;
    }
    @SuppressWarnings("unused")
    public Double getCrdy() {
        return crdy;
    }
    @SuppressWarnings("unused")
    public void setCrdy(Double crdy) {
        this.crdy = crdy;
    }
    @SuppressWarnings("unused")
    public Double getCrdr() {
        return crdr;
    }
    @SuppressWarnings("unused")
    public void setCrdr(Double crdr) {
        this.crdr = crdr;
    }
    @SuppressWarnings("unused")
    public Double getXg() {
        return xg;
    }
    @SuppressWarnings("unused")
    public void setXg(Double xg) {
        this.xg = xg;
    }
    @SuppressWarnings("unused")
    public Double getXag() {
        return xag;
    }
    @SuppressWarnings("unused")
    public void setXag(Double xag) {
        this.xag = xag;
    }
    @SuppressWarnings("unused")
    public String getTeam() {
        return team;
    }
    @SuppressWarnings("unused")
    public void setTeam(String team) {
        this.team = team;
    }
}
