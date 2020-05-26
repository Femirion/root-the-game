package com.femirion.rootthegame.model.core.world.element;

import com.femirion.rootthegame.model.core.artifact.Artifact;
import lombok.Builder;
import lombok.Data;

import java.util.Optional;
import java.util.Set;

@Builder
@Data
public class Ruins {
    Set<Artifact> artifacts;

    public Set<Artifact> showArtifacts() {
        return artifacts;
    }

    public Optional<Artifact> getArtifact(Artifact artifact) {
        if (artifacts.isEmpty() || !artifacts.contains(artifact)) {
            return Optional.empty();
        }

        artifacts.remove(artifact);
        return Optional.of(artifact);
    }
}
