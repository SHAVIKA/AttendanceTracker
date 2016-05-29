<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!-- ------------------- aside (Left side column. contains the logo and sidebar) ------------------- -->
<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel (optional) -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="resources/assets/image/user2-160x160.png" class="img-circle" alt="User Image" />
			</div>
			<div class="pull-left info">
				<p>ADMIN</p>
				<!-- Status -->

				<small><i class="fa fa-circle text-success"></i>&nbsp;Infosys pvt ltd.</small>
			</div>
		</div>

		<!-- search form (Optional) -->
		<form action="#" method="get" class="sidebar-form">
			<div class="input-group">
				<input type="text" name="q" class="form-control" placeholder="Search..." /> <span class="input-group-btn">
					<button type='submit' name='search' id='search-btn' class="btn btn-flat">
						<i class="fa fa-search"></i>
					</button>
				</span>
			</div>
		</form>

		<!-- Sidebar Menu -->
		<div>
			<ul class="sidebar-menu" ng-controller="NavbarController">
				<li class="header">NAVIGATION</li>
				<!-- Optionally, you can add icons to the links -->
				<li class="active"><a href="#/dashboard"><i class="fa fa-dashboard active"></i> <span>Dashboard</span></a></li>
				<li class=""><a href=""> <i class='fa fa-laptop'></i> <span>Organization</span> <i class="fa fa-angle-left pull-right"></i></a>
					<ul class="treeview-menu">
						<li><a href="#/organizationList"><i class="fa fa-circle-o"></i>&nbsp;Organization</a></li>
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Org. Level</a></li>
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Org. Structure</a></li>
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;E-mail / SMS Config</a></li>
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;System Config</a></li>
					</ul></li>
				<li class=""><a href=""><i class='fa fa-user'></i> <span>Employee</span> <i class="fa fa-angle-left pull-right"></i></a>
					<ul class="treeview-menu">
						<li><a href="#/employeelist"><i class="fa fa-circle-o"></i>&nbsp;Employee Details</a></li>
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Employee Assign</a></li>
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Status</a></li>
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Manage</a></li>
					</ul></li>
				<li class=""><a href=""><i class='fa fa-edit'></i> <span>Device</span> <i class="fa fa-angle-left pull-right"></i></a>
					<ul class="treeview-menu">
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Device Details</a></li>
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Configure</a></li>
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Status</a></li>
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Manage</a></li>
					</ul></li>
				<li class=""><a href=""><i class='fa fa-calendar'></i> <span>Leave</span> <i class="fa fa-angle-left pull-right"></i></a>
					<ul class="treeview-menu">
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Leave Declare</a></li>
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Schedule</a></li>
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Status/Approval</a></li>
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Configure</a></li>
					</ul></li>
				<li class=""><a href=""><i class='fa fa-pie-chart'></i> <span>Report</span> <i class="fa fa-angle-left pull-right"></i></a>
					<ul class="treeview-menu">
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Daily Report</a></li>
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Monthly Report</a></li>
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Shift Report</a></li>
						<li><a href=""><i class="fa fa-circle-o"></i>&nbsp;Leave Report</a></li>
					</ul></li>
				<li class="header"></li>
				<li><a href=""><i class='fa fa-circle-o text-red'></i> <span>About US</span></a></li>
			</ul>
		</div>
	</section>
</aside>