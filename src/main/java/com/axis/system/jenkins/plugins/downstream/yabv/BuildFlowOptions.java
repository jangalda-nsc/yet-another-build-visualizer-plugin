package com.axis.system.jenkins.plugins.downstream.yabv;

public class BuildFlowOptions {
  private boolean showBuildHistory;
  private boolean showDurationInfo;
  private boolean showUpstreamBuilds;
  private boolean flattenView;
  private boolean minimum2elements;

  public BuildFlowOptions() {
    showBuildHistory = false;
    showDurationInfo = false;
    showUpstreamBuilds = false;
    flattenView = false;
    minimum2elements = false;
  }

  public BuildFlowOptions(
      boolean showBuildHistory,
      boolean showDurationInfo,
      boolean showUpstreamBuilds,
      boolean flattenView,
      boolean minimum2elements) {
    this.showBuildHistory = showBuildHistory;
    this.showDurationInfo = showDurationInfo;
    this.showUpstreamBuilds = showUpstreamBuilds;
    this.flattenView = flattenView;
    this.minimum2elements = minimum2elements;
  }

  public boolean isShowBuildHistory() {
    return showBuildHistory;
  }

  public void setShowBuildHistory(boolean showBuildHistory) {
    this.showBuildHistory = showBuildHistory;
  }

  public boolean isShowDurationInfo() {
    return showDurationInfo;
  }

  public void setShowDurationInfo(boolean showDurationInfo) {
    this.showDurationInfo = showDurationInfo;
  }

  public boolean isShowUpstreamBuilds() {
    return showUpstreamBuilds;
  }

  public void setShowUpstreamBuilds(boolean showUpstreamBuilds) {
    this.showUpstreamBuilds = showUpstreamBuilds;
  }

  public boolean isFlattenView() {
    return flattenView;
  }

  public void setFlattenView(boolean flattenView) {
    this.flattenView = flattenView;
  }

  public boolean isMinimum2elements() {
    return minimum2elements;
  }

  public void setMinimum2elements(boolean minimum2elements) {
    this.minimum2elements = minimum2elements;
  }

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("BuildFlowOptions{");
    sb.append("showBuildHistory=").append(showBuildHistory);
    sb.append(", showDurationInfo=").append(showDurationInfo);
    sb.append(", showUpstreamBuilds=").append(showUpstreamBuilds);
    sb.append(", flattenView=").append(flattenView);
    sb.append(", minimum2elements=").append(minimum2elements);
    sb.append('}');
    return sb.toString();
  }
}
