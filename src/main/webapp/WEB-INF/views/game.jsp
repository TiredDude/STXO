<%@ page language="java" contentType="text/html; charset=Utf8"
	pageEncoding="Utf8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
	<tag:head title="Game" />
	<div class="user-action-bar">
		<span class="user-action-sound" > 80% </span>
		<div id="audioSlider"></div>
	</div>
	<div class="container main-container game-container-wrapper">
		<div class="game-container">
			<div class="player-title-container" id="player-title-1">
				<span class="player-title">Player 1</span>
			</div>
			<div class="player-title-container" id="player-title-2">
				<span class="player-title">Player 2</span>
			</div>
			
			<div class="score-title-container">
				<span class="score-title">1 - 0</span>
			</div>
			
			<span class="game-status-title">[ Player 2 turn... ]</span>
			
			<span class="game-rounds-title">ROUND 1/10</span>
			
			<div class="game-board">
				<div class="board-line-w1"></div>
				<div class="board-line-w2"></div> 
				<div class="board-line-h1"></div>
				<div class="board-line-h2"></div>
				<div class="board-cell-container">
					<span class="board-cell cell-font-red" id="cell-1">x</span>
					<span class="board-cell cell-font-blue" id="cell-2">o</span>
					<span class="board-cell cell-font-red" id="cell-3">x</span>
					<span class="board-cell cell-font-red" id="cell-4">x</span>
					<span class="board-cell cell-font-red" id="cell-6">x</span>
					<span class="board-cell cell-font-blue" id="cell-5">o</span>
					<span class="board-cell cell-font-blue" id="cell-7">o</span>
					<span class="board-cell cell-font-red" id="cell-9">x</span>
					<span class="board-cell cell-font-blue" id="cell-8">o</span>
				</div>
			</div>
		</div>
	</div>
	<tag:footer />
</html>
