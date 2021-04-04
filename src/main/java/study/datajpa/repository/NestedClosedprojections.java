package study.datajpa.repository;

public interface NestedClosedprojections {

    String getUsername();
    TeamInfo getTeam();

    interface TeamInfo{
        String getName();
    }
}
