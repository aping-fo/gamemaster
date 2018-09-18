package com.luckygames.wmxz.gamemaster.service;

        import com.github.pagehelper.Page;
        import com.luckygames.wmxz.gamemaster.dao.RechargeSimulationEntity;
        import com.luckygames.wmxz.gamemaster.model.entity.RechargeSimulation;
        import com.luckygames.wmxz.gamemaster.model.view.request.RechargeSimulationSearchQuery;
        import com.luckygames.wmxz.gamemaster.service.base.BaseService;

public interface RechargeSimulationService extends BaseService<RechargeSimulationEntity> {
    Page<RechargeSimulation> searchPage(RechargeSimulationSearchQuery query);
    void addRechargeSimulation(RechargeSimulationSearchQuery query);
    void delRechargeSimulation(Long id);
    RechargeSimulation searchById(Long id);
}